package academy.atl.rover.services;

import academy.atl.rover.models.Direction;
import academy.atl.rover.models.Rover;
import academy.atl.rover.repository.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoverServiceImp implements RoverService {

    @Autowired
    RoverRepository repository;

    @Override
    public Rover get() {
        List<Rover> roverList = repository.findAll();
        return roverList.get(0);
    }

    @Override
    public void sendCommand(String command) {
        Rover rover = get();

        if ("F".equalsIgnoreCase(command) && Direction.NORTH.equals(rover.getDirection())) {
            int posYFinal = rover.getY() - 1;
            rover.setY(posYFinal);
        }
        repository.save(rover);
    }
}
