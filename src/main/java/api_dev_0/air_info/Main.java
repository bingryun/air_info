package api_dev_0.air_info;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import api_dev_0.air_info.controller.AirPollutionAPI;
import api_dev_0.air_info.controller.AirPollutionApiController;
import api_dev_0.air_info.view.AirPollutionApiView;

import api_dev_0.air_info.controller.ApiExplorerAPI;
import api_dev_0.air_info.controller.ApiExplorerApiController;
import api_dev_0.air_info.view.ApiExplorerApiView;

import java.io.IOException;
import java.sql.SQLException;

import org.json.simple.parser.ParseException;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;


@SpringBootApplication
public class Main {

	public static void main(String[] args) throws SQLException {
//  	로그파일 설정을 위한 print
//    	LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//      StatusPrinter.print(lc);
//		AirPollutionAPI api = new AirPollutionAPI();
//		AirPollutionApiView view = new AirPollutionApiView();
//		AirPollutionApiController controller = new AirPollutionApiController(api, view);

		ApiExplorerAPI E_api = new ApiExplorerAPI();
		ApiExplorerApiView E_view = new ApiExplorerApiView();
		ApiExplorerApiController E_controller = new ApiExplorerApiController(E_api, E_view);


		try {
//			controller.fetchData();
			E_controller.fetchData();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}
}

