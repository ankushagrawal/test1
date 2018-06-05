package com.quizzo.core.utils.datetime.provider;

import java.time.ZonedDateTime;

/**
 * This interface defines the methods used to get the current
 * date and time.
 */
public interface DateTimeService {

    /**
     * Returns the current date and time.
     *
     * @return
     */
    ZonedDateTime getCurrentDateAndTime();
}