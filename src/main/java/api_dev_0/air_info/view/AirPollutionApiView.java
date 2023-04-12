package api_dev_0.air_info.view;

import org.json.simple.JSONArray;

import java.io.UnsupportedEncodingException;
import java.util.List;
import api_dev_0.air_info.model.AirPollutionData;

public class AirPollutionApiView {

    public JSONArray render(JSONArray jsonArray) {
        System.out.println(jsonArray);
        return jsonArray;
    }

    public void renderSqlInsertQuery(List<AirPollutionData> dataList) throws UnsupportedEncodingException {
        for (AirPollutionData data : dataList) {
            System.out.println(data.toSqlInsertQuery());
        }
    }
}
