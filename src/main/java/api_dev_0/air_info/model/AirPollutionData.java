package api_dev_0.air_info.model;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;

public class AirPollutionData {

    private String pm10Value;
    private String pm25Grade;
    private String no2Grade;
    private String no2Flag;
    private String pm25Flag;
    private String pm10Flag;
    private String khaiGrade;
    private String o3Value;
    private String o3Flag;
    private String so2Grade;
    private String khaiValue;
    private String o3Grade;
    private String so2Value;
    private String no2Value;
    private String pm25Value;
    private String pm10Grade;
    private String coFlag;
    private String dataTime;
    private String sidoName;
    private String coValue;
    private String so2Flag;
    private String coGrade;
    private String stationName;

    // 생성자
    public AirPollutionData(String pm10Value, String pm25Grade, String no2Grade, String no2Flag, String pm25Flag, String pm10Flag, String khaiGrade, String o3Value, String o3Flag, String so2Grade, String khaiValue, String o3Grade, String so2Value, String no2Value, String pm25Value, String pm10Grade, String coFlag, String dataTime, String sidoName, String coValue, String so2Flag, String coGrade, String stationName) {
        this.pm10Value = pm10Value;
        this.pm25Grade = pm25Grade;
        this.no2Grade = no2Grade;
        this.no2Flag = no2Flag;
        this.pm25Flag = pm25Flag;
        this.pm10Flag = pm10Flag;
        this.khaiGrade = khaiGrade;
        this.o3Value = o3Value;
        this.o3Flag = o3Flag;
        this.so2Grade = so2Grade;
        this.khaiValue = khaiValue;
        this.o3Grade = o3Grade;
        this.so2Value = so2Value;
        this.no2Value = no2Value;
        this.pm25Value = pm25Value;
        this.pm10Grade = pm10Grade;
        this.coFlag = coFlag;
        this.dataTime = dataTime;
        this.sidoName = sidoName;
        this.coValue = coValue;
        this.so2Flag = so2Flag;
        this.coGrade = coGrade;
        this.stationName = stationName;
    }

    // Getters and Setters
    public String getPm10Value() {
        return pm10Value;
    }

    public void setPm10Value(String pm10Value) {
        this.pm10Value = pm10Value;
    }

    public String getPm25Grade() {
        return pm25Grade;
    }

    public void setPm25Grade(String pm25Grade) {
        this.pm25Grade = pm25Grade;
    }

    public String getNo2Grade() {
        return no2Grade;
    }

    public void setNo2Grade(String no2Grade) {
        this.no2Grade = no2Grade;
    }

    public String getNo2Flag() {
        return no2Flag;
    }

    public void setNo2Flag(String no2Flag) {
        if (no2Flag == null) {
            no2Flag="00";
        }
        else if (no2Flag.equals("점검및교정")){
            no2Flag="01";
        }
        else if (no2Flag.equals("장비점검")){
            no2Flag="02";
        }
        else if (no2Flag.equals("자료이상")){
            no2Flag="03";
        }
        else if (no2Flag.equals("통신장애")){
            no2Flag="04";
        }
        this.no2Flag = no2Flag;
    }

    public String getPm25Flag() {
        return pm25Flag;
    }

    public void setPm25Flag(String pm25Flag) {
        if (pm25Flag == null) {
            pm25Flag="00";
        }
        else if (pm25Flag.equals("점검및교정")){
            pm25Flag="01";
        }
        else if (pm25Flag.equals("장비점검")){
            pm25Flag="02";
        }
        else if (pm25Flag.equals("자료이상")){
            pm25Flag="03";
        }
        else if (pm25Flag.equals("통신장애")){
            pm25Flag="04";
        }
        this.pm25Flag = pm25Flag;
    }

    public String getPm10Flag() {
        return pm10Flag;
    }

    public void setPm10Flag(String pm10Flag) {
        if (pm10Flag == null) {
            pm10Flag="00";
        }
        else if (pm10Flag.equals("점검및교정")){
            pm10Flag="01";
        }
        else if (pm10Flag.equals("장비점검")){
            pm10Flag="02";
        }
        else if (pm10Flag.equals("자료이상")){
            pm10Flag="03";
        }
        else if (pm10Flag.equals("통신장애")){
            pm10Flag="04";
        }
        this.pm10Flag = pm10Flag;
    }

    public String getKhaiGrade() {
        return khaiGrade;
    }

    public void setKhaiGrade(String khaiGrade) {
        this.khaiGrade = khaiGrade;
    }

    public String getO3Value() {
        return o3Value;
    }

    public void setO3Value(String o3Value) {
        this.o3Value = o3Value;
    }

    public String getO3Flag() {
        return o3Flag;
    }

    public void setO3Flag(String o3Flag) {
        if (o3Flag == null) {
            o3Flag="00";
        }
        else if (o3Flag.equals("점검및교정")){
            o3Flag="01";
        }
        else if (o3Flag.equals("장비점검")){
            o3Flag="02";
        }
        else if (o3Flag.equals("자료이상")){
            o3Flag="03";
        }
        else if (o3Flag.equals("통신장애")){
            o3Flag="04";
        }
        this.o3Flag = o3Flag;
    }

    public String getSo2Grade() {
        return so2Grade;
    }

    public void setSo2Grade(String so2Grade) {
        this.so2Grade = so2Grade;
    }

    public String getKhaiValue() {
        return khaiValue;
    }

    public void setKhaiValue(String khaiValue) {
        this.khaiValue = khaiValue;
    }

    public String getO3Grade() {
        return o3Grade;
    }

    public void setO3Grade(String o3Grade) {
        this.o3Grade = o3Grade;
    }

    public String getSo2Value() {
        return so2Value;
    }

    public void setSo2Value(String so2Value) {
        this.so2Value = so2Value;
    }

    public String getNo2Value() {
        return no2Value;
    }
    public void setNo2Value(String no2Value) {
        this.no2Value = no2Value;
    }

    public String getPm25Value() {
        return pm25Value;
    }

    public void setPm25Value(String pm25Value) {
        this.pm25Value = pm25Value;
    }

    public String getPm10Grade() {
        return pm10Grade;
    }

    public void setPm10Grade(String pm10Grade) {
        this.pm10Grade = pm10Grade;
    }

    public String getCoFlag() {
        return coFlag;
    }

    public void setCoFlag(String coFlag) {
        if (coFlag == null) {
            coFlag="00";
        }
        else if (coFlag.equals("점검및교정")){
            coFlag="01";
        }
        else if (coFlag.equals("장비점검")){
            coFlag="02";
        }
        else if (coFlag.equals("자료이상")){
            coFlag="03";
        }
        else if (coFlag.equals("통신장애")){
            coFlag="04";
        }
        this.coFlag = coFlag;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getSidoName() {
        return sidoName;
    }

    public void setSidoName(String sidoName) {
        this.sidoName = sidoName;
    }

    public String getCoValue() {
        return coValue;
    }

    public void setCoValue(String coValue) {
        this.coValue = coValue;
    }

    public String getSo2Flag() {
        return so2Flag;
    }

    public void setSo2Flag(String so2Flag) {
        if (so2Flag == null) {
            so2Flag="00";
        }
        else if (so2Flag.equals("점검및교정")){
            so2Flag="01";
        }
        else if (so2Flag.equals("장비점검")){
            so2Flag="02";
        }
        else if (so2Flag.equals("자료이상")){
            so2Flag="03";
        }
        else if (so2Flag.equals("통신장애")){
            so2Flag="04";
        }
        this.so2Flag = so2Flag;
    }

    public String getCoGrade() {
        return coGrade;
    }

    public void setCoGrade(String coGrade) {
        this.coGrade = coGrade;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }


    // 저장을 위한 SQL 쿼리를 생성하는 메소드
    public String toSqlInsertQuery() {
        String[] columns = {"PM10_VALUE", "PM25_GRADE", "NO2_GRADE", "NO2_FLAG", "PM25_FLAG", "PM10_FLAG", "KHAI_GRADE", "O3_VALUE", "O3_FLAG", "SO2_GRADE", "KHAI_VALUE", "O3_GRADE", "SO2_VALUE", "NO2_VALUE", "PM25_VALUE", "PM10_GRADE", "CO_FLAG", "DATATIME", "SIDO_NAME", "CO_VALUE", "SO2_FLAG", "CO_GRADE","STATION_NAME"};

        String values = prepareValue(getPm10Value()) + "," +
                prepareValue(getPm25Grade()) + "," +
                prepareValue(getNo2Grade()) + "," +
                prepareValue(getNo2Flag()) + "," +
                prepareValue(getPm25Flag()) + "," +
                prepareValue(getPm10Flag()) + "," +
                prepareValue(getKhaiGrade()) + "," +
                prepareValue(getO3Value()) + "," +
                prepareValue(getO3Flag()) + "," +
                prepareValue(getSo2Grade()) + "," +
                prepareValue(getKhaiValue()) + "," +
                prepareValue(getO3Grade()) + "," +
                prepareValue(getSo2Value()) + "," +
                prepareValue(getNo2Value()) + "," +
                prepareValue(getPm25Value()) + "," +
                prepareValue(getPm10Grade()) + "," +
                prepareValue(getCoFlag()) + ",'" +
                getDataTime() + "','" +
                getSidoName() + "'," +
                prepareValue(getCoValue()) + "," +
                prepareValue(getSo2Flag()) + "," +
                prepareValue(getCoGrade()) + ",'" +
                getStationName() +"'";
        return "INSERT INTO AIR_POLL_INFO (" + String.join(",", columns) + ") VALUES (" + values + ")";
    }
    // 숫자형에서 null 인 경우 처리
    private String prepareValue(Object value) {
        if (value == null || !isParsableAsNumber(value)) {
            return "NULL";
        } else if (value instanceof String || value instanceof LocalDateTime) {
            return "'" + value.toString() + "'";
        } else {
            return value.toString();
        }
    }
    //투입값이 숫자인지 아닌지 구분
    private boolean isParsableAsNumber(Object value) {
        if (value instanceof Number) {
            return true;
        }

        if (value instanceof String) {
            String stringValue = (String) value;
            try {
                Double.parseDouble(stringValue);
                return true;
            } catch (NumberFormatException e) {
                // Not a valid number
            }
        }

        return false;
    }
    // 저장을 위한 SQL 쿼리를 생성하는 메소드
    public String toSqlInsertQueryStation() {
        String[] columns = {"SIDO_NAME","STATION_NAME"};

        String values = "'" +
                getSidoName() + "','" +
                getStationName() + "'";
        return "INSERT INTO AIR_STTN_INFO (" + String.join(",", columns) + ") VALUES (" + values + ")";
    }

}
