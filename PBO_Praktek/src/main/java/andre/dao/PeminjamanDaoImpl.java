/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andre.dao;
import andre.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author andreferdinan
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
     private List<Peminjaman> data = new ArrayList<>();
     
        public PeminjamanDaoImpl(){
            data.add(new Peminjaman ("001","B001","09-05-2023","10-10-2023"));
            data.add(new Peminjaman ("002","B002","14-01-2023","12-10-2023"));
            
        }
        
        public   void insert(Peminjaman peminjaman) {
           data.add(peminjaman);
       }
       
        public   void update(int index, Peminjaman peminjaman){
            data.set(index,peminjaman);
        }
        
        public   void delete(int index){
            data.remove(index);
        }
        
        public   Peminjaman getPeminjaman(int index){
            return data.get(index);
        }
        
        public   List <Peminjaman>getAll(){
            return data;
        }
}
