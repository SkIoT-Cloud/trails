package com.github.srang.skiot.trails;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;

/**
 * Created by samuelrang on 4/20/2017.
 */
public class TrailVerticle extends AbstractVerticle {
  @Override
  public void start(Future<Void> fut) {
    HttpServer server = vertx.createHttpServer();
    Router r = Router.router(vertx);
    r.route("/health").handler(routingContext -> {
      routingContext.response().end(new JsonObject().put("message", "Hello from my first Vert.x 3 application").encode());
    });
    server.requestHandler(r::accept).listen(Integer.valueOf(8080), result -> {
      if (result.succeeded()) {
        fut.complete();
      } else {
        fut.fail(result.cause());
      }
    });
  }
}
