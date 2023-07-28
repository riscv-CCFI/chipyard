package chipyard

import freechips.rocketchip.config.{Config}
import constellation.channel._
import constellation.routing._
import constellation.topology._
import constellation.noc._
import constellation.soc.{GlobalNoCParams}
import scala.collection.immutable.ListMap
import PARoCCAccelConfig._

class CCFIConfig extends Config(
	 new WithPARoCCAccel ++
   new freechips.rocketchip.subsystem.WithNBigCores(1) ++    // Specify we want some number of Rocket cores

  new chipyard.config.AbstractConfig
)

