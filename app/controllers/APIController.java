package controllers;

import models.Info;
import play.libs.Json;
import play.mvc.*;

public class APIController extends Controller{

	public Result firstRequest(String method) {
		Info info = new Info();
		
		info.setAge(27);
		info.setName("Aldo");
		
		return ok(Json.toJson(info)).as("application/json");
	}
}
