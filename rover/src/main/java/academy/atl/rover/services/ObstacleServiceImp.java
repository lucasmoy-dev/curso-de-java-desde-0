package academy.atl.rover.services;

import academy.atl.rover.dto.ObstacleDto;
import academy.atl.rover.models.Obstacle;
import academy.atl.rover.repository.ObstacleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObstacleServiceImp implements ObstacleService {

    @Autowired
    private ObstacleRepository repository;
    @Override
    public List<Obstacle> findAll() {
        return repository.findAll();
    }
}
