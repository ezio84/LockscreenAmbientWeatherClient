package org.pixelexperience.weather.client;

class Constants {
    static final Boolean DEBUG = false;
    static final int API_CACHE_NO_CONNECTION_MAX_TIME = 3600; // 1 hour on seconds if no internet available
    static final int LOCATION_CHECK_INTERVAL = 1/*1ms*/*1000/*1second*/*60/*1min*/*30/*30min*/;
    static final int LOCATION_CHECK_FASTEST_INTERVAL = 1/*1ms*/*1000/*1second*/*60/*1min*/*10/*10min*/;
}
