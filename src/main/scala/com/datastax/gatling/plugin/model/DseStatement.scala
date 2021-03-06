/*
 * Copyright (c) 2018 Datastax Inc.
 *
 * This software can be used solely with DataStax products. Please consult the file LICENSE.md.
 */

package com.datastax.gatling.plugin.model

import io.gatling.commons.validation.Validation
import io.gatling.core.session.Session

/**
  * This class serves as a common class between CQL and Graph queries.
  *
  * It contains a single method which allows a query (a instance of `Statement`
  * to be built from the Gatling session parameters, aka the feeders). A typical
  * usage is, for instance, finding the values to bind to CQL parameters.
  */
trait DseStatement[S] {
  def buildFromSession(session: Session): Validation[S]
}
