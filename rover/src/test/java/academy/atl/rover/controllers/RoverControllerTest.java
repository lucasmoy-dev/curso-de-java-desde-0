package academy.atl.rover.controllers;

import academy.atl.rover.dto.CommandDto;
import academy.atl.rover.services.RoverService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class RoverControllerTest {

    @Mock
    private RoverService roverService;

    @InjectMocks
    private RoverController controller;


    @Test
    public void whenSendCommand_callService() {
        CommandDto commandDto = new CommandDto();
        List<String> commandsList = new ArrayList<>();
        commandsList.add("F");
        commandDto.setCommands(commandsList);

        controller.sendCommand(commandDto);

        verify(roverService, times(1)).sendCommand("F");
    }

    @Test
    public void whenSendCommand_FRF_callService() {
        CommandDto commandDto = new CommandDto();
        List<String> commandsList = new ArrayList<>();
        commandsList.add("F");
        commandsList.add("R");
        commandsList.add("F");
        commandDto.setCommands(commandsList);

        controller.sendCommand(commandDto);

        verify(roverService, times(3)).sendCommand(any());
    }
}
