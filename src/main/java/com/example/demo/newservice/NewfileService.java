import com.example.demo.newservice;

import com.example.demo.entity.Studententity;

public interface NewfileService{
    Studententity savedata(Studententity newfile);
    Studententity  getidval(Long id)
    List<Studententity> getall();
    Studententity update( Long id,Studententity newfile);
}