package hei.steven.foot.services;

import hei.steven.foot.models.Match;
import hei.steven.foot.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public List<Match> findAll(){
        return matchRepository.findAll();
    }

    public Match findById(int id){
        return matchRepository.findById(id).get();
    }
}
