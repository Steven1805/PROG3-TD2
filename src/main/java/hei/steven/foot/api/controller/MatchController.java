package hei.steven.foot.api.controller;

import hei.steven.foot.dto.MatchDetailDto;
import hei.steven.foot.dto.MatchDto;
import hei.steven.foot.mapper.MatchMapper;
import hei.steven.foot.models.Match;
import hei.steven.foot.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/matchs")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchMapper matchMapper;

    @GetMapping
    public List<MatchDto> getMatchs(){
        return matchService.findAll().stream().map(matchMapper::toMatchDto)
                .collect(Collectors.toList());
    }

    @GetMapping(value="/{id}")
    public MatchDetailDto getMatch(@PathVariable int id){
        return matchMapper.toMatchDetailDto(matchService.findById(id));
    }
}
