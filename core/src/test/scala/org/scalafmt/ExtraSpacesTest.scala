package org.scalafmt

import scala.meta.Tree
import scala.meta.parsers.Parse

import org.scalafmt.util.DiffAssertions
import org.scalafmt.util.DiffTest
import org.scalafmt.util.HasTests
import org.scalatest.FunSuite

class ExtraSpacesTest
    extends FunSuite with HasTests with DiffAssertions {

  val defnSite3callSite5 = """
<<< #116
function[T](a, b)
>>>
function[ T ]( a, b )
""".replace("'''", "\"\"\"")

  override val tests = parseDiffTests(
      defnSite3callSite5, "spaces/spaces.stat")

  runTestsDefault()
}
