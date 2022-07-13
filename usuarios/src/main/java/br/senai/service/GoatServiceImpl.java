package br.senai.service;

import br.senai.model.Goat;
import br.senai.model.Usuario;
import br.senai.repository.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoatServiceImpl implements GoatService {

    @Autowired
    GoatRepository gamesRepository;

    @Override
    public List <Goat> findAll() {
        return gamesRepository.findAll();
    }

    @Override
    public Optional<Goat> findById(long id) {
        return gamesRepository.findById(id);
    }

    @Override
    public Goat create(Goat goat) {
        return null;
    }

    @Override
    public Goat update(Goat goat, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }


}
