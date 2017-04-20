package com.github.srang.skiot.trails;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;

/**
 * Created by samuelrang on 4/20/2017.
 */
public class MainVerticle extends AbstractVerticle {
  @Override
  public void start(Future<Void> fut) {
    vertx.createHttpServer().requestHandler(r -> {
      r.response().end(new JsonObject().put("message", "Hello from my first Vert.x 3 application").encode());
    }).listen(8080, result -> {
      if (result.succeeded()) {
        fut.complete();
      } else {
        fut.fail(result.cause());
      }
    });
  }
}
