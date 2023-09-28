package academy.atl.rover.services;

import academy.atl.rover.models.Rover;


public interface RoverService {
    public Rover get();

    void sendCommand(String command);
}
