# Unfortunately, I can't seem to be able to use the sbt-scalafmt plugin for this :(
scalafmt-nightly --style defaultWithAlign -i -f core/src/main/scala
scalafmt-nightly --style defaultWithAlign -i -f core/src/test/scala
scalafmt-nightly --style defaultWithAlign -i -f benchmarks/src/main/scala
scalafmt-nightly --style defaultWithAlign -i -f benchmarks/src/test/scala
scalafmt-nightly --style defaultWithAlign -i -f cli/src/main/scala
scalafmt-nightly --style defaultWithAlign -i -f cli/src/test/scala
scalafmt-nightly --style defaultWithAlign -i -f scalafmtSbt/src/main/scala
scalafmt-nightly --style defaultWithAlign -i -f scalafmtSbt/src/test/scala
