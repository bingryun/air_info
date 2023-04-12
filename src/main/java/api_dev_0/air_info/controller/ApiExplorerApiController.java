package api_dev_0.air_info.controller;

import api_dev_0.air_info.model.AirPollutionData;
import api_dev_0.air_info.model.ApiExplorerData;
import api_dev_0.air_info.model.DatabaseConnection;
import api_dev_0.air_info.view.ApiExplorerApiView;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class ApiExplorerApiController {

    private ApiExplorerAPI api;
    private ApiExplorerApiView view;
    private final DatabaseConnection dbConnection;

    public ApiExplorerApiController(ApiExplorerAPI api, ApiExplorerApiView view) {
        this.api = api;
        this.view = view;
        this.dbConnection = new DatabaseConnection();
    }

    public JSONArray parseJson(String jsonString) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject resultJsonObj = (JSONObject) jsonParser.parse(jsonString);
        JSONObject resultJsonObj0 = (JSONObject) resultJsonObj.get("response");
        JSONObject resultJsonObj1 = (JSONObject) resultJsonObj0.get("body");
        JSONObject resultJsonObj2 = (JSONObject) resultJsonObj1.get("items");
        JSONArray resultJsonArray = (JSONArray) resultJsonObj2.get("item");
        return resultJsonArray;
    }


    public List<ApiExplorerData> processData(JSONArray jsonArray) {
        List<ApiExplorerData> dataList = new ArrayList<>();

        for (Object obj : jsonArray) {
            JSONObject item = (JSONObject) obj;
            ApiExplorerData data = new ApiExplorerData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            data.setStnId((String) item.get("stnId"));
            data.setTm((String) item.get("tm"));
            data.setStnNm((String) item.get("stnNm"));
            data.setRnum((String) item.get("rnum"));
            data.setM03Te((String) item.get("m03Te"));
            data.setM02Te((String) item.get("m02Te"));
            data.setM01Te((String) item.get("m01Te"));
            data.setM005Te((String) item.get("m005Te"));
            data.setTs((String) item.get("ts"));
            data.setDmstMtphNo((String) item.get("dmstMtphNo"));
            data.setGndSttCd((String) item.get("gndSttCd"));
            data.setVs((String) item.get("vs"));
            data.setLcsCh((String) item.get("lcsCh"));
            data.setClfmAbbrCd((String) item.get("clfmAbbrCd"));
            data.setDc10LmcsCa((String) item.get("dc10LmcsCa"));
            data.setDc10Tca((String) item.get("dc10Tca"));
            data.setHr3Fhsc((String) item.get("hr3Fhsc"));
            data.setDsnw((String) item.get("dsnw"));
            data.setIcsr((String) item.get("icsr"));
            data.setSs((String) item.get("ss"));
            data.setSsQcflag((String) item.get("ssQcflag"));
            data.setPs((String) item.get("ps"));
            data.setPsQcflag((String) item.get("psQcflag"));
            data.setPa((String) item.get("pa"));
            data.setPaQcflag((String) item.get("paQcflag"));
            data.setTd((String) item.get("td"));
            data.setPv((String) item.get("pv"));
            data.setHm((String) item.get("hm"));
            data.setHmQcflag((String) item.get("hmQcflag"));
            data.setWd((String) item.get("wd"));
            data.setWdQcflag((String) item.get("wdQcflag"));
            data.setWs((String) item.get("ws"));
            data.setWsQcflag((String) item.get("wsQcflag"));
            data.setRn((String) item.get("rn"));
            data.setRnQcflag((String) item.get("rnQcflag"));
            data.setTa((String) item.get("ta"));
            data.setTaQcflag((String) item.get("taQcflag"));
            data.setTsQcflg((String) item.get("tsQcflg"));

            dataList.add(data);
        }
        return dataList;
    }


    public void fetchData() throws IOException, ParseException {
        String urlString = api.buildUrl();
        HttpURLConnection conn = api.createConnection(urlString);
        String response = api.getResponse(conn);

        JSONArray jsonArray = parseJson(response);

        view.render(jsonArray);

        List<ApiExplorerData> dataList = processData(jsonArray);
        view.renderSqlInsertQuery(dataList);

        for (ApiExplorerData data0 : dataList) {
            String insertSql = data0.toSqlInsertQuery();
            dbConnection.executeInsertQuery(insertSql);
        }

    }
}