package com.example.demo.newservice.newserviceimpl;

public class Newfileseviceimpl implements Newfileservice{
    private final NewfileRepo rep;
    public Newfileservicempl(Newfilerepo rep){
        this.rep=rep;
    }
    @Override
    public Studententity savedata(Studententity new){
       return rep.save(new);
    }
    @Override
    public getidval(Long id){

    }
    @Override
    public List<Studententity>getall(){

    }
    @Override
    public New


}