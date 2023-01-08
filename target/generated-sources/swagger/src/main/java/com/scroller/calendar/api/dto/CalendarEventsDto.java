package com.scroller.calendar.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CalendarEventsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-21T23:42:46.294178+05:30[Asia/Kolkata]")


public class CalendarEventsDto   {
  @JsonProperty("calendar_event")
  private List calendarEvent = null;

  public CalendarEventsDto calendarEvent(List calendarEvent) {
    this.calendarEvent = calendarEvent;
    return this;
  }

  /**
   * Get calendarEvent
   * @return calendarEvent
   **/
  @Schema(description = "")
  
    @Valid
    public List getCalendarEvent() {
    return calendarEvent;
  }

  public void setCalendarEvent(List calendarEvent) {
    this.calendarEvent = calendarEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEventsDto calendarEvents = (CalendarEventsDto) o;
    return Objects.equals(this.calendarEvent, calendarEvents.calendarEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEventsDto {\n");
    
    sb.append("    calendarEvent: ").append(toIndentedString(calendarEvent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
