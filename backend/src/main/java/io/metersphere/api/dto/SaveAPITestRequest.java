package io.metersphere.api.dto;

import io.metersphere.api.dto.scenario.Scenario;
import io.metersphere.dto.ScheduleDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SaveAPITestRequest {

    private String id;

    private String projectId;

    private String name;

    private List<Scenario> scenarioDefinition;

    private ScheduleDTO schedule;
}
