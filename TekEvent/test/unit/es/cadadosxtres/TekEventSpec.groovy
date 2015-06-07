package es.cadadosxtres

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@Unroll
@TestFor(TekEvent)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
		when:"A tekEvent has name and city"
			def tekEvent = new TekEvent(name: 'Groovy Day',
				city: 'San Francisco', organizer: [fullName: 'Jon Doe'] as TekUser)
		then:"the method toString combined them"
			tekEvent.toString() == 'Groovy Day, San Francisco'
    }
}
