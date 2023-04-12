package api_dev_0.air_info.view;

import api_dev_0.air_info.model.ApiExplorerData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class ApiExplorerApiView {

    public JSONArray render(JSONArray jsonArray) {
        System.out.println("V " + jsonArray);
        return jsonArray;
    }

    public void renderSqlInsertQuery(List<ApiExplorerData> dataList) throws UnsupportedEncodingException {
        for (ApiExplorerData data : dataList) {
            System.out.println("V " + data.toSqlInsertQuery());
        }
    }
}
