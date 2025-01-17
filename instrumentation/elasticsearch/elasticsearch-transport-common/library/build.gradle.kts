plugins {
  id("otel.library-instrumentation")
}

dependencies {
  compileOnly("org.elasticsearch.client:transport:5.0.0")

  compileOnly("com.google.auto.value:auto-value-annotations")
  annotationProcessor("com.google.auto.value:auto-value")
}
