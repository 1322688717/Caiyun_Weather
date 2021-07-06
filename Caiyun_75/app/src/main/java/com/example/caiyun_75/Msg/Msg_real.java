package com.example.caiyun_75.Msg;

import java.util.List;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
public class Msg_real {

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private String status;
    @com.fasterxml.jackson.annotation.JsonProperty("api_version")
    private String apiVersion;
    @com.fasterxml.jackson.annotation.JsonProperty("api_status")
    private String apiStatus;
    @com.fasterxml.jackson.annotation.JsonProperty("lang")
    private String lang;
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private String unit;
    @com.fasterxml.jackson.annotation.JsonProperty("tzshift")
    private int tzshift;
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private String timezone;
    @com.fasterxml.jackson.annotation.JsonProperty("server_time")
    private int serverTime;
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private ResultDTO result;
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getServerTime() {
        return serverTime;
    }

    public void setServerTime(int serverTime) {
        this.serverTime = serverTime;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResultDTO {
        @com.fasterxml.jackson.annotation.JsonProperty("realtime")
        private RealtimeDTO realtime;
        @com.fasterxml.jackson.annotation.JsonProperty("primary")
        private int primary;
        private String forecast_keypoint;

        public String getForecast_keypoint() {
            return forecast_keypoint;
        }

        public void setForecast_keypoint(String forecast_keypoint) {
            this.forecast_keypoint = forecast_keypoint;
        }

        public RealtimeDTO getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeDTO realtime) {
            this.realtime = realtime;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
        public static class RealtimeDTO {
            @com.fasterxml.jackson.annotation.JsonProperty("status")
            private String status;
            @com.fasterxml.jackson.annotation.JsonProperty("temperature")
            private String temperature;
            @com.fasterxml.jackson.annotation.JsonProperty("humidity")
            private double humidity;
            @com.fasterxml.jackson.annotation.JsonProperty("cloudrate")
            private double cloudrate;
            @com.fasterxml.jackson.annotation.JsonProperty("skycon")
            private String skycon;
            @com.fasterxml.jackson.annotation.JsonProperty("visibility")
            private double visibility;
            @com.fasterxml.jackson.annotation.JsonProperty("dswrf")
            private double dswrf;
            @com.fasterxml.jackson.annotation.JsonProperty("wind")
            private WindDTO wind;
            @com.fasterxml.jackson.annotation.JsonProperty("pressure")
            private double pressure;
            @com.fasterxml.jackson.annotation.JsonProperty("apparent_temperature")
            private double apparentTemperature;
            @com.fasterxml.jackson.annotation.JsonProperty("precipitation")
            private PrecipitationDTO precipitation;
            @com.fasterxml.jackson.annotation.JsonProperty("air_quality")
            private AirQualityDTO air_quality;
            @com.fasterxml.jackson.annotation.JsonProperty("life_index")
            private LifeIndexDTO lifeIndex;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(double cloudrate) {
                this.cloudrate = cloudrate;
            }

            public String getSkycon() {
                return skycon;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getDswrf() {
                return dswrf;
            }

            public void setDswrf(double dswrf) {
                this.dswrf = dswrf;
            }

            public WindDTO getWind() {
                return wind;
            }

            public void setWind(WindDTO wind) {
                this.wind = wind;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getApparentTemperature() {
                return apparentTemperature;
            }

            public void setApparentTemperature(double apparentTemperature) {
                this.apparentTemperature = apparentTemperature;
            }

            public PrecipitationDTO getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(PrecipitationDTO precipitation) {
                this.precipitation = precipitation;
            }

            public AirQualityDTO getAirQuality() {
                return air_quality;
            }

            public void setAirQuality(AirQualityDTO airQuality) {
                this.air_quality = airQuality;
            }

            public LifeIndexDTO getLifeIndex() {
                return lifeIndex;
            }

            public void setLifeIndex(LifeIndexDTO lifeIndex) {
                this.lifeIndex = lifeIndex;
            }

            @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
            public static class WindDTO {
                @com.fasterxml.jackson.annotation.JsonProperty("speed")
                private double speed;
                @com.fasterxml.jackson.annotation.JsonProperty("direction")
                private double direction;

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }
            }

            @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
            public static class PrecipitationDTO {
                @com.fasterxml.jackson.annotation.JsonProperty("local")
                private LocalDTO local;
                @com.fasterxml.jackson.annotation.JsonProperty("nearest")
                private NearestDTO nearest;

                public LocalDTO getLocal() {
                    return local;
                }

                public void setLocal(LocalDTO local) {
                    this.local = local;
                }

                public NearestDTO getNearest() {
                    return nearest;
                }

                public void setNearest(NearestDTO nearest) {
                    this.nearest = nearest;
                }

                @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
                public static class LocalDTO {
                    @com.fasterxml.jackson.annotation.JsonProperty("status")
                    private String status;
                    @com.fasterxml.jackson.annotation.JsonProperty("datasource")
                    private String datasource;
                    @com.fasterxml.jackson.annotation.JsonProperty("intensity")
                    private double intensity;

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getDatasource() {
                        return datasource;
                    }

                    public void setDatasource(String datasource) {
                        this.datasource = datasource;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }
                }

                @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
                public static class NearestDTO {
                    @com.fasterxml.jackson.annotation.JsonProperty("status")
                    private String status;
                    @com.fasterxml.jackson.annotation.JsonProperty("distance")
                    private double distance;
                    @com.fasterxml.jackson.annotation.JsonProperty("intensity")
                    private double intensity;

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public double getDistance() {
                        return distance;
                    }

                    public void setDistance(double distance) {
                        this.distance = distance;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }
                }
            }

            @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
            public static class AirQualityDTO {
                @com.fasterxml.jackson.annotation.JsonProperty("pm25")
                private String pm25;
                @com.fasterxml.jackson.annotation.JsonProperty("pm10")
                private double pm10;
                @com.fasterxml.jackson.annotation.JsonProperty("o3")
                private double o3;
                @com.fasterxml.jackson.annotation.JsonProperty("so2")
                private double so2;
                @com.fasterxml.jackson.annotation.JsonProperty("no2")
                private double no2;
                @com.fasterxml.jackson.annotation.JsonProperty("co")
                private double co;
                @com.fasterxml.jackson.annotation.JsonProperty("aqi")
                private AqiDTO aqi;
                @com.fasterxml.jackson.annotation.JsonProperty("description")
                private DescriptionDTO description;

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public double getPm10() {
                    return pm10;
                }

                public void setPm10(double pm10) {
                    this.pm10 = pm10;
                }

                public double getO3() {
                    return o3;
                }

                public void setO3(double o3) {
                    this.o3 = o3;
                }

                public double getSo2() {
                    return so2;
                }

                public void setSo2(double so2) {
                    this.so2 = so2;
                }

                public double getNo2() {
                    return no2;
                }

                public void setNo2(double no2) {
                    this.no2 = no2;
                }

                public double getCo() {
                    return co;
                }

                public void setCo(double co) {
                    this.co = co;
                }

                public AqiDTO getAqi() {
                    return aqi;
                }

                public void setAqi(AqiDTO aqi) {
                    this.aqi = aqi;
                }

                public DescriptionDTO getDescription() {
                    return description;
                }

                public void setDescription(DescriptionDTO description) {
                    this.description = description;
                }

                @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
                public static class AqiDTO {
                    @com.fasterxml.jackson.annotation.JsonProperty("chn")
                    private String chn;
                    @com.fasterxml.jackson.annotation.JsonProperty("usa")
                    private double usa;

                    public String getChn() {
                        return chn;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }

                    public double getUsa() {
                        return usa;
                    }

                    public void setUsa(double usa) {
                        this.usa = usa;
                    }
                }

                @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
                public static class DescriptionDTO {
                    @com.fasterxml.jackson.annotation.JsonProperty("chn")
                    private String chn;
                    @com.fasterxml.jackson.annotation.JsonProperty("usa")
                    private String usa;

                    public String getChn() {
                        return chn;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }

                    public String getUsa() {
                        return usa;
                    }

                    public void setUsa(String usa) {
                        this.usa = usa;
                    }
                }
            }

            @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
            public static class LifeIndexDTO {
                @com.fasterxml.jackson.annotation.JsonProperty("ultraviolet")
                private UltravioletDTO ultraviolet;
                @com.fasterxml.jackson.annotation.JsonProperty("comfort")
                private ComfortDTO comfort;

                public UltravioletDTO getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(UltravioletDTO ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public ComfortDTO getComfort() {
                    return comfort;
                }

                public void setComfort(ComfortDTO comfort) {
                    this.comfort = comfort;
                }

                @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
                public static class UltravioletDTO {
                    @com.fasterxml.jackson.annotation.JsonProperty("index")
                    private double index;
                    @com.fasterxml.jackson.annotation.JsonProperty("desc")
                    private String desc;

                    public double getIndex() {
                        return index;
                    }

                    public void setIndex(double index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
                public static class ComfortDTO {
                    @com.fasterxml.jackson.annotation.JsonProperty("index")
                    private int index;
                    @com.fasterxml.jackson.annotation.JsonProperty("desc")
                    private String desc;

                    public int getIndex() {
                        return index;
                    }

                    public void setIndex(int index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }
            }
        }
    }
}
