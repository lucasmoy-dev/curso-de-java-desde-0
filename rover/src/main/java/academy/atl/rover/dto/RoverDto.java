package academy.atl.rover.dto;

import academy.atl.rover.models.Direction;
import lombok.Data;

@Data
public class RoverDto {
    private Integer x;
    private Integer y;
    private Direction direction;
}
