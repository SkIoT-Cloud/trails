package com.github.srang.skiot.trails;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;

/**
 * Created by samuelrang on 4/20/2017.
 */
public class Application {
  public static void main (String[] args) {
    Vertx.vertx().deployVerticle("scala:com.github.srang.skiot.trails.TrailVerticle");
    Vertx.vertx().deployVerticle("com.github.srang.skiot.trails.MainVerticle");
  }
}
