package api_dev_0.air_info.controller;

import api_dev_0.air_info.model.AirPollutionData;
import api_dev_0.air_info.model.DatabaseConnection;
import api_dev_0.air_info.view.AirPollutionApiView;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class AirPollutionApiController {

    private AirPollutionAPI api;
    private AirPollutionApiView view;
    private final DatabaseConnection dbConnection;

    public AirPollutionApiController(AirPollutionAPI api, AirPollutionApiView view) {
        this.api = api;
        this.view = view;
        this.dbConnection = new DatabaseConnection();
    }

    public JSONArray parseJson(String jsonString) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject resultJsonObj = (JSONObject) jsonParser.parse(jsonString);
        JSONObject resultJsonObj0 = (JSONObject) resultJsonObj.get("response");
        JSONArray resultJsonArray = (JSONArray) ((JSONObject) resultJsonObj0.get("body")).get("items");

        return resultJsonArray;
    }


    public List<AirPollutionData> processData(JSONArray jsonArray) {
        List<AirPollutionData> dataList = new ArrayList<>();

        for (Object obj : jsonArray) {
            JSONObject item = (JSONObject) obj;
            AirPollutionData data = new AirPollutionData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            data.setSidoName((String) item.get("sidoName"));
            data.setStationName((String) item.get("stationName"));
            data.setPm10Value((String) item.get("pm10Value"));
            data.setPm25Value((String) item.get("pm25Value"));
            data.setO3Value((String) item.get("o3Value"));
            data.setNo2Value((String) item.get("no2Value"));
            data.setSo2Value((String) item.get("so2Value"));
            data.setCoValue((String) item.get("coValue"));
            data.setKhaiValue((String) item.get("khaiValue"));
            data.setKhaiGrade((String) item.get("khaiGrade"));
            data.setPm10Grade((String) item.get("pm10Grade"));
            data.setPm25Grade((String) item.get("pm25Grade"));
            data.setO3Grade((String) item.get("o3Grade"));
            data.setNo2Grade((String) item.get("no2Grade"));
            data.setSo2Grade((String) item.get("so2Grade"));
            data.setCoGrade((String) item.get("coGrade"));
            data.setNo2Flag((String) item.get("no2Flag"));
            data.setPm25Flag((String) item.get("pm25Flag"));
            data.setPm10Flag((String) item.get("pm10Flag"));
            data.setO3Flag((String) item.get("o3Flag"));
            data.setSo2Flag((String) item.get("so2Flag"));
            data.setCoFlag((String) item.get("coFlag"));
            data.setDataTime((String) item.get("dataTime"));
            dataList.add(data);
        }
        return dataList;
    }


    public void fetchData() throws IOException, ParseException {
        String[] sidoList = { "서울", "부산", "대구", "인천", "광주", "대전", "울산", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주", "세종"};
//    	String[] sidoList = { "전북"};
        for (String sido : sidoList) {
            String urlString = api.buildUrl("json", 20 , 1, sido , "1.0");
            HttpURLConnection conn = api.createConnection(urlString);
            String response = api.getResponse(conn);
            JSONArray jsonArray = parseJson(response);

            view.render(jsonArray);

            List<AirPollutionData> dataList = processData(jsonArray);
            view.renderSqlInsertQuery(dataList);

            for (AirPollutionData data : dataList) {
                String insertSql = data.toSqlInsertQuery();
                String insertSqlStation = data.toSqlInsertQueryStation();
                dbConnection.executeInsertQuery(insertSql);
                dbConnection.executeInsertQuery(insertSqlStation);
            }
        }

    }
}