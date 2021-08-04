package Level_9.lvl_9_task_13.statistic.event;

import java.util.Date;

public interface EventDataRow {
    EventType getType();
    Date getDate(); //Дата создания записи
    int getTime(); //Время или продолжительность
}
