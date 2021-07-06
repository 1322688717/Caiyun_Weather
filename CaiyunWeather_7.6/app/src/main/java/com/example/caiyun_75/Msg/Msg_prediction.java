package com.example.caiyun_75.Msg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Msg_prediction {
    @JsonProperty("status")
    private String status;
    @JsonProperty("api_version")
    private String apiVersion;
    @JsonProperty("api_status")
    private String apiStatus;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("tzshift")
    private int tzshift;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("server_time")
    private int serverTime;
    @JsonProperty("result")
    private ResultDTO result;
    @JsonProperty("location")
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResultDTO {
        @JsonProperty("alert")
        private AlertDTO alert;
        @JsonProperty("realtime")
        private RealtimeDTO realtime;
        @JsonProperty("minutely")
        private MinutelyDTO minutely;
        @JsonProperty("hourly")
        private HourlyDTO hourly;
        @JsonProperty("daily")
        private DailyDTO daily;
        @JsonProperty("primary")
        private int primary;
        @JsonProperty("forecast_keypoint")
        private String forecastKeypoint;

        public AlertDTO getAlert() {
            return alert;
        }

        public void setAlert(AlertDTO alert) {
            this.alert = alert;
        }

        public RealtimeDTO getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeDTO realtime) {
            this.realtime = realtime;
        }

        public MinutelyDTO getMinutely() {
            return minutely;
        }

        public void setMinutely(MinutelyDTO minutely) {
            this.minutely = minutely;
        }

        public HourlyDTO getHourly() {
            return hourly;
        }

        public void setHourly(HourlyDTO hourly) {
            this.hourly = hourly;
        }

        public DailyDTO getDaily() {
            return daily;
        }

        public void setDaily(DailyDTO daily) {
            this.daily = daily;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public String getForecastKeypoint() {
            return forecastKeypoint;
        }

        public void setForecastKeypoint(String forecastKeypoint) {
            this.forecastKeypoint = forecastKeypoint;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class AlertDTO {
            @JsonProperty("status")
            private String status;
            @JsonProperty("content")
            private List<ContentDTO> content;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<ContentDTO> getContent() {
                return content;
            }

            public void setContent(List<ContentDTO> content) {
                this.content = content;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class ContentDTO {
                @JsonProperty("province")
                private String province;
                @JsonProperty("status")
                private String status;
                @JsonProperty("code")
                private String code;
                @JsonProperty("description")
                private String description;
                @JsonProperty("pubtimestamp")
                private double pubtimestamp;
                @JsonProperty("city")
                private String city;
                @JsonProperty("adcode")
                private String adcode;
                @JsonProperty("regionId")
                private String regionId;
                @JsonProperty("county")
                private String county;
                @JsonProperty("alertId")
                private String alertId;
                @JsonProperty("request_status")
                private String requestStatus;
                @JsonProperty("source")
                private String source;
                @JsonProperty("title")
                private String title;
                @JsonProperty("location")
                private String location;
                @JsonProperty("latlon")
                private List<Double> latlon;

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public double getPubtimestamp() {
                    return pubtimestamp;
                }

                public void setPubtimestamp(double pubtimestamp) {
                    this.pubtimestamp = pubtimestamp;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAdcode() {
                    return adcode;
                }

                public void setAdcode(String adcode) {
                    this.adcode = adcode;
                }

                public String getRegionId() {
                    return regionId;
                }

                public void setRegionId(String regionId) {
                    this.regionId = regionId;
                }

                public String getCounty() {
                    return county;
                }

                public void setCounty(String county) {
                    this.county = county;
                }

                public String getAlertId() {
                    return alertId;
                }

                public void setAlertId(String alertId) {
                    this.alertId = alertId;
                }

                public String getRequestStatus() {
                    return requestStatus;
                }

                public void setRequestStatus(String requestStatus) {
                    this.requestStatus = requestStatus;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public List<Double> getLatlon() {
                    return latlon;
                }

                public void setLatlon(List<Double> latlon) {
                    this.latlon = latlon;
                }
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class RealtimeDTO {
            @JsonProperty("status")
            private String status;
            @JsonProperty("temperature")
            private double temperature;
            @JsonProperty("humidity")
            private double humidity;
            @JsonProperty("cloudrate")
            private double cloudrate;
            @JsonProperty("skycon")
            private String skycon;
            @JsonProperty("visibility")
            private double visibility;
            @JsonProperty("dswrf")
            private double dswrf;
            @JsonProperty("wind")
            private WindDTO wind;
            @JsonProperty("pressure")
            private double pressure;
            @JsonProperty("apparent_temperature")
            private double apparentTemperature;
            @JsonProperty("precipitation")
            private PrecipitationDTO precipitation;
            @JsonProperty("air_quality")
            private AirQualityDTO airQuality;
            @JsonProperty("life_index")
            private LifeIndexDTO lifeIndex;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
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
                return airQuality;
            }

            public void setAirQuality(AirQualityDTO airQuality) {
                this.airQuality = airQuality;
            }

            public LifeIndexDTO getLifeIndex() {
                return lifeIndex;
            }

            public void setLifeIndex(LifeIndexDTO lifeIndex) {
                this.lifeIndex = lifeIndex;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class WindDTO {
                @JsonProperty("speed")
                private double speed;
                @JsonProperty("direction")
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

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class PrecipitationDTO {
                @JsonProperty("local")
                private LocalDTO local;
                @JsonProperty("nearest")
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class LocalDTO {
                    @JsonProperty("status")
                    private String status;
                    @JsonProperty("datasource")
                    private String datasource;
                    @JsonProperty("intensity")
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class NearestDTO {
                    @JsonProperty("status")
                    private String status;
                    @JsonProperty("distance")
                    private double distance;
                    @JsonProperty("intensity")
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

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class AirQualityDTO {
                @JsonProperty("pm25")
                private double pm25;
                @JsonProperty("pm10")
                private double pm10;
                @JsonProperty("o3")
                private double o3;
                @JsonProperty("so2")
                private double so2;
                @JsonProperty("no2")
                private double no2;
                @JsonProperty("co")
                private double co;
                @JsonProperty("aqi")
                private AqiDTO aqi;
                @JsonProperty("description")
                private DescriptionDTO description;

                public double getPm25() {
                    return pm25;
                }

                public void setPm25(double pm25) {
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class AqiDTO {
                    @JsonProperty("chn")
                    private double chn;
                    @JsonProperty("usa")
                    private double usa;

                    public double getChn() {
                        return chn;
                    }

                    public void setChn(double chn) {
                        this.chn = chn;
                    }

                    public double getUsa() {
                        return usa;
                    }

                    public void setUsa(double usa) {
                        this.usa = usa;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DescriptionDTO {
                    @JsonProperty("chn")
                    private String chn;
                    @JsonProperty("usa")
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

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class LifeIndexDTO {
                @JsonProperty("ultraviolet")
                private UltravioletDTO ultraviolet;
                @JsonProperty("comfort")
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class UltravioletDTO {
                    @JsonProperty("index")
                    private double index;
                    @JsonProperty("desc")
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class ComfortDTO {
                    @JsonProperty("index")
                    private int index;
                    @JsonProperty("desc")
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

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class MinutelyDTO {
            @JsonProperty("status")
            private String status;
            @JsonProperty("datasource")
            private String datasource;
            @JsonProperty("description")
            private String description;
            @JsonProperty("precipitation_2h")
            private List<Double> precipitation2h;
            @JsonProperty("precipitation")
            private List<Double> precipitation;
            @JsonProperty("probability")
            private List<Double> probability;

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

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<Double> getPrecipitation2h() {
                return precipitation2h;
            }

            public void setPrecipitation2h(List<Double> precipitation2h) {
                this.precipitation2h = precipitation2h;
            }

            public List<Double> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<Double> precipitation) {
                this.precipitation = precipitation;
            }

            public List<Double> getProbability() {
                return probability;
            }

            public void setProbability(List<Double> probability) {
                this.probability = probability;
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class HourlyDTO {
            @JsonProperty("status")
            private String status;
            @JsonProperty("description")
            private String description;
            @JsonProperty("air_quality")
            private AirQualityDTOX airQuality;
            @JsonProperty("precipitation")
            private List<PrecipitationDTOX> precipitation;
            @JsonProperty("temperature")
            private List<TemperatureDTO> temperature;
            @JsonProperty("wind")
            private List<WindDTOX> wind;
            @JsonProperty("humidity")
            private List<HumidityDTO> humidity;
            @JsonProperty("cloudrate")
            private List<CloudrateDTO> cloudrate;
            @JsonProperty("skycon")
            private List<SkyconDTO> skycon;
            @JsonProperty("pressure")
            private List<PressureDTO> pressure;
            @JsonProperty("visibility")
            private List<VisibilityDTO> visibility;
            @JsonProperty("dswrf")
            private List<DswrfDTO> dswrf;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public AirQualityDTOX getAirQuality() {
                return airQuality;
            }

            public void setAirQuality(AirQualityDTOX airQuality) {
                this.airQuality = airQuality;
            }

            public List<PrecipitationDTOX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationDTOX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<TemperatureDTO> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureDTO> temperature) {
                this.temperature = temperature;
            }

            public List<WindDTOX> getWind() {
                return wind;
            }

            public void setWind(List<WindDTOX> wind) {
                this.wind = wind;
            }

            public List<HumidityDTO> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityDTO> humidity) {
                this.humidity = humidity;
            }

            public List<CloudrateDTO> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateDTO> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<SkyconDTO> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconDTO> skycon) {
                this.skycon = skycon;
            }

            public List<PressureDTO> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureDTO> pressure) {
                this.pressure = pressure;
            }

            public List<VisibilityDTO> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityDTO> visibility) {
                this.visibility = visibility;
            }

            public List<DswrfDTO> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfDTO> dswrf) {
                this.dswrf = dswrf;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class AirQualityDTOX {
                @JsonProperty("aqi")
                private List<AqiDTOX> aqi;
                @JsonProperty("pm25")
                private List<Pm25DTO> pm25;

                public List<AqiDTOX> getAqi() {
                    return aqi;
                }

                public void setAqi(List<AqiDTOX> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25DTO> getPm25() {
                    return pm25;
                }

                public void setPm25(List<Pm25DTO> pm25) {
                    this.pm25 = pm25;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class AqiDTOX {
                    @JsonProperty("datetime")
                    private String datetime;
                    @JsonProperty("value")
                    private ValueDTO value;

                    public String getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public ValueDTO getValue() {
                        return value;
                    }

                    public void setValue(ValueDTO value) {
                        this.value = value;
                    }

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    public static class ValueDTO {
                        @JsonProperty("chn")
                        private int chn;
                        @JsonProperty("usa")
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class Pm25DTO {
                    @JsonProperty("datetime")
                    private String datetime;
                    @JsonProperty("value")
                    private int value;

                    public String getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class PrecipitationDTOX {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class TemperatureDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class WindDTOX {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("speed")
                private double speed;
                @JsonProperty("direction")
                private double direction;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

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

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class HumidityDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class CloudrateDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class SkyconDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private String value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class PressureDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class VisibilityDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DswrfDTO {
                @JsonProperty("datetime")
                private String datetime;
                @JsonProperty("value")
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DailyDTO {
            @JsonProperty("status")
            private String status;
            @JsonProperty("air_quality")
            private AirQualityDTOXX airQuality;
            @JsonProperty("life_index")
            private LifeIndexDTOX lifeIndex;
            @JsonProperty("astro")
            private List<AstroDTO> astro;
            @JsonProperty("precipitation")
            private List<PrecipitationDTOXX> precipitation;
            @JsonProperty("temperature")
            private List<TemperatureDTOX> temperature;
            @JsonProperty("wind")
            private List<WindDTOXX> wind;
            @JsonProperty("humidity")
            private List<HumidityDTOX> humidity;
            @JsonProperty("cloudrate")
            private List<CloudrateDTOX> cloudrate;
            @JsonProperty("pressure")
            private List<PressureDTOX> pressure;
            @JsonProperty("visibility")
            private List<VisibilityDTOX> visibility;
            @JsonProperty("dswrf")
            private List<DswrfDTOX> dswrf;
            @JsonProperty("skycon")
            private List<SkyconDTOX> skycon;
            @JsonProperty("skycon_08h_20h")
            private List<Skycon08h20hDTO> skycon08h20h;
            @JsonProperty("skycon_20h_32h")
            private List<Skycon20h32hDTO> skycon20h32h;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public AirQualityDTOXX getAirQuality() {
                return airQuality;
            }

            public void setAirQuality(AirQualityDTOXX airQuality) {
                this.airQuality = airQuality;
            }

            public LifeIndexDTOX getLifeIndex() {
                return lifeIndex;
            }

            public void setLifeIndex(LifeIndexDTOX lifeIndex) {
                this.lifeIndex = lifeIndex;
            }

            public List<AstroDTO> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroDTO> astro) {
                this.astro = astro;
            }

            public List<PrecipitationDTOXX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationDTOXX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<TemperatureDTOX> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureDTOX> temperature) {
                this.temperature = temperature;
            }

            public List<WindDTOXX> getWind() {
                return wind;
            }

            public void setWind(List<WindDTOXX> wind) {
                this.wind = wind;
            }

            public List<HumidityDTOX> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityDTOX> humidity) {
                this.humidity = humidity;
            }

            public List<CloudrateDTOX> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateDTOX> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<PressureDTOX> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureDTOX> pressure) {
                this.pressure = pressure;
            }

            public List<VisibilityDTOX> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityDTOX> visibility) {
                this.visibility = visibility;
            }

            public List<DswrfDTOX> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfDTOX> dswrf) {
                this.dswrf = dswrf;
            }

            public List<SkyconDTOX> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconDTOX> skycon) {
                this.skycon = skycon;
            }

            public List<Skycon08h20hDTO> getSkycon08h20h() {
                return skycon08h20h;
            }

            public void setSkycon08h20h(List<Skycon08h20hDTO> skycon08h20h) {
                this.skycon08h20h = skycon08h20h;
            }

            public List<Skycon20h32hDTO> getSkycon20h32h() {
                return skycon20h32h;
            }

            public void setSkycon20h32h(List<Skycon20h32hDTO> skycon20h32h) {
                this.skycon20h32h = skycon20h32h;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class AirQualityDTOXX {
                @JsonProperty("aqi")
                private List<AqiDTOXX> aqi;
                @JsonProperty("pm25")
                private List<Pm25DTOX> pm25;

                public List<AqiDTOXX> getAqi() {
                    return aqi;
                }

                public void setAqi(List<AqiDTOXX> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25DTOX> getPm25() {
                    return pm25;
                }

                public void setPm25(List<Pm25DTOX> pm25) {
                    this.pm25 = pm25;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class AqiDTOXX {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("max")
                    private MaxDTO max;
                    @JsonProperty("avg")
                    private AvgDTO avg;
                    @JsonProperty("min")
                    private MinDTO min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public MaxDTO getMax() {
                        return max;
                    }

                    public void setMax(MaxDTO max) {
                        this.max = max;
                    }

                    public AvgDTO getAvg() {
                        return avg;
                    }

                    public void setAvg(AvgDTO avg) {
                        this.avg = avg;
                    }

                    public MinDTO getMin() {
                        return min;
                    }

                    public void setMin(MinDTO min) {
                        this.min = min;
                    }

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    public static class MaxDTO {
                        @JsonProperty("chn")
                        private int chn;
                        @JsonProperty("usa")
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    public static class AvgDTO {
                        @JsonProperty("chn")
                        private double chn;
                        @JsonProperty("usa")
                        private double usa;

                        public double getChn() {
                            return chn;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }
                    }

                    @JsonIgnoreProperties(ignoreUnknown = true)
                    public static class MinDTO {
                        @JsonProperty("chn")
                        private int chn;
                        @JsonProperty("usa")
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class Pm25DTOX {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("max")
                    private int max;
                    @JsonProperty("avg")
                    private double avg;
                    @JsonProperty("min")
                    private int min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public int getMax() {
                        return max;
                    }

                    public void setMax(int max) {
                        this.max = max;
                    }

                    public double getAvg() {
                        return avg;
                    }

                    public void setAvg(double avg) {
                        this.avg = avg;
                    }

                    public int getMin() {
                        return min;
                    }

                    public void setMin(int min) {
                        this.min = min;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class LifeIndexDTOX {
                @JsonProperty("ultraviolet")
                private List<UltravioletDTOX> ultraviolet;
                @JsonProperty("carWashing")
                private List<CarWashingDTO> carWashing;
                @JsonProperty("dressing")
                private List<DressingDTO> dressing;
                @JsonProperty("comfort")
                private List<ComfortDTOX> comfort;
                @JsonProperty("coldRisk")
                private List<ColdRiskDTO> coldRisk;

                public List<UltravioletDTOX> getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(List<UltravioletDTOX> ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public List<CarWashingDTO> getCarWashing() {
                    return carWashing;
                }

                public void setCarWashing(List<CarWashingDTO> carWashing) {
                    this.carWashing = carWashing;
                }

                public List<DressingDTO> getDressing() {
                    return dressing;
                }

                public void setDressing(List<DressingDTO> dressing) {
                    this.dressing = dressing;
                }

                public List<ComfortDTOX> getComfort() {
                    return comfort;
                }

                public void setComfort(List<ComfortDTOX> comfort) {
                    this.comfort = comfort;
                }

                public List<ColdRiskDTO> getColdRisk() {
                    return coldRisk;
                }

                public void setColdRisk(List<ColdRiskDTO> coldRisk) {
                    this.coldRisk = coldRisk;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class UltravioletDTOX {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("index")
                    private String index;
                    @JsonProperty("desc")
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class CarWashingDTO {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("index")
                    private String index;
                    @JsonProperty("desc")
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class DressingDTO {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("index")
                    private String index;
                    @JsonProperty("desc")
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class ComfortDTOX {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("index")
                    private String index;
                    @JsonProperty("desc")
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class ColdRiskDTO {
                    @JsonProperty("date")
                    private String date;
                    @JsonProperty("index")
                    private String index;
                    @JsonProperty("desc")
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
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

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class AstroDTO {
                @JsonProperty("date")
                private String date;
                @JsonProperty("sunrise")
                private SunriseDTO sunrise;
                @JsonProperty("sunset")
                private SunsetDTO sunset;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunriseDTO getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseDTO sunrise) {
                    this.sunrise = sunrise;
                }

                public SunsetDTO getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetDTO sunset) {
                    this.sunset = sunset;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class SunriseDTO {
                    @JsonProperty("time")
                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class SunsetDTO {
                    @JsonProperty("time")
                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class PrecipitationDTOXX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class TemperatureDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private String avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public String getAvg() {
                    return avg;
                }

                public void setAvg(String avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class WindDTOXX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private MaxDTOX max;
                @JsonProperty("min")
                private MinDTOX min;
                @JsonProperty("avg")
                private AvgDTOX avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxDTOX getMax() {
                    return max;
                }

                public void setMax(MaxDTOX max) {
                    this.max = max;
                }

                public MinDTOX getMin() {
                    return min;
                }

                public void setMin(MinDTOX min) {
                    this.min = min;
                }

                public AvgDTOX getAvg() {
                    return avg;
                }

                public void setAvg(AvgDTOX avg) {
                    this.avg = avg;
                }

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class MaxDTOX {
                    @JsonProperty("speed")
                    private double speed;
                    @JsonProperty("direction")
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class MinDTOX {
                    @JsonProperty("speed")
                    private double speed;
                    @JsonProperty("direction")
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

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class AvgDTOX {
                    @JsonProperty("speed")
                    private double speed;
                    @JsonProperty("direction")
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
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class HumidityDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private Double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public Double getAvg() {
                    return avg;
                }

                public void setAvg(Double avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class CloudrateDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class PressureDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class VisibilityDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class DswrfDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("max")
                private double max;
                @JsonProperty("min")
                private double min;
                @JsonProperty("avg")
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class SkyconDTOX {
                @JsonProperty("date")
                private String date;
                @JsonProperty("value")
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Skycon08h20hDTO {
                @JsonProperty("date")
                private String date;
                @JsonProperty("value")
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Skycon20h32hDTO {
                @JsonProperty("date")
                private String date;
                @JsonProperty("value")
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
