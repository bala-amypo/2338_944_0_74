package com.example.demo.newservice.newserviceimpl;

public class Newfileseviceimpl implements Newfileservice{
    private final Newfilerepo rep;
    public Newfileservicempl(Newfilerepo rep){
        this.rep=rep;
    }
    @Override
    public Studententity savedata(Studententity new){
       return rep.save(new);
    }
    @Override
    public Newentity getidval(Long id){

    }
    @Override
    public List<Newentity>getall(){

    }
    @Override
    public New


}