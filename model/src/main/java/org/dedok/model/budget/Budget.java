package org.dedok.model.budget;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Budget
{
    @Id
    private String id;
    private List<String> votingIds;
    private int updateDayOfMonth;
    private Amount currentAmount;
    private Date creationDate;
    //TODO: Make budget last update as aspect
    private Date lastUpdate;
}
