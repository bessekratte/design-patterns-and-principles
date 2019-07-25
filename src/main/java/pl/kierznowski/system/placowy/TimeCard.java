package pl.kierznowski.system.placowy;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class TimeCard {

    private int employeeId;
    private LocalDate date;
    private double time;
}
