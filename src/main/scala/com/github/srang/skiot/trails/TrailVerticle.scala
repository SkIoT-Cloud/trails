package com.github.srang.skiot.trails

import io.vertx.lang.scala.ScalaVerticle
import io.vertx.lang.scala.json.Json;

class TrailVerticle extends ScalaVerticle {

  override def start(): Unit = {
    vertx.createHttpServer().requestHandler(request => {
      request.response().end(Json.obj(("message", "hello from scala")).encode())
    }).listen(8081)
  }
}