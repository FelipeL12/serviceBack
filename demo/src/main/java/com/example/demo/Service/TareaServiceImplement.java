package com.example.demo.Service;

import com.example.demo.Dao.TareaDao;
import com.example.demo.model.Tarea;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImplement implements TareaService{

    @Autowired
    private TareaDao tareaDao;


    @Override
    public List<Tarea> findAll() {
        return (List<Tarea>)  tareaDao.findAll();
    }

    @Override
    public Tarea save(Tarea tarea) {
        return tareaDao.save(tarea);
    }

    @Override
    public Tarea findById(Integer id) {
        return tareaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        tareaDao.deleteById(id);
    }
}
