package dao;

import dto.Producto;
import java.util.List;
import modelo.dao.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductoDAO {
    public void ingresarProducto(Producto producto){
        SessionFactory sf = null;
        Session session = null;
        Transaction tx = null;
        try {
            sf = NewHibernateUtil.getSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(producto);
            tx.commit();
            session.close();
        }catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No se puede guardar el producto");
        }
    }
    
    public String consultarProducto(String codigo){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        // select * from producto where codigo = this.codigo
        Producto p = (Producto)session.get(Producto.class, codigo);
        session.close();
        if (p!=null) {
            return "El producto de codigo "+p.getCodigo()+
                    " cuyo nombre es "+p.getNombre()+ " precio "+
                    p.getPrecio()+" tiene un stock "+p.getStock()+
                    " y su descripcion es "+p.getDescripcion() +".";
        }else{
           return  "El producto de codigo "+p.getCodigo()+
                    " no existe.";
        }
    }
    
    public Producto consultarProductoCompleto(String codigo){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        // select * from producto where codigo = this.codigo
        Producto p = (Producto)session.get(Producto.class, codigo);
        session.close();
        if (p!=null) {
            return p;
        }
        return null;
    }
    
    public List<Producto> verProductos(){
        //Cuando es una consulta al bd se debe usar un objeto de hibernate llamado query
      SessionFactory sf = NewHibernateUtil.getSessionFactory();
      Session session = sf.openSession();
      // El siguiente objeto de query se puede hacer de dos formas una delgando a hql (lenguaje de consulta) que es el
      //lenguaje propio de hibernate o ejecutar ancestarmente la colsulta con sql
      Query query = session.createQuery("from Producto");
      // En la consulta hql para saber que consulta agregar se procede a añadirla dandole click izquierdo sobre
      // hibernate.cfg.xml y aquí añadir la correspondiente consulta haciendo referencia a los POJOS
      List<Producto> lista = query.list();
      session.close();
      return lista;
    }
    
    public String eliminarProducto(String codigo){
        SessionFactory sf=null;
        Session session=null;
        Transaction tx=null;
        Producto producto = null;
        try{
            sf=NewHibernateUtil.getSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            producto = (Producto)session.get(Producto.class, codigo);
            session.delete(producto);
            tx.commit();
            return "Se ha eliminado el producto con código "+codigo;
        }catch(HibernateException e){
            tx.rollback();
            throw new RuntimeException("No se pudo eliminar el producto");
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
        
    }
    
    public String editarProducto(Producto product){
        SessionFactory sf=null;
        Session session=null;
        Transaction tx=null;
        //Producto producto=null;
        try{
            sf=NewHibernateUtil.getSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
//            producto = (Producto)session.get(Producto.class, product.getCodigo());
//            producto.setNombre(product.getNombre());
//            producto.setStock(product.getStock());
//            producto.setPrecio(product.getPrecio());
//            producto.setDescripcion(product.getDescripcion());
//            
            session.update(product);
            tx.commit();
            return "Se ha actualizado el producto con código "+ product.getCodigo();
        }catch(HibernateException e){
            tx.rollback();
            throw new RuntimeException("No se pudo editar el producto");
        }
        finally{
            if(session!=null){
                session.close();
            }
        }
    }
}
