package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("When a POST request with a User is made, the UserID is returned")
    request {
        method 'POST'
        url '/users'
        headers {
            contentType(applicationJson())
        }
        body(
                firstName: 'Pamela',
                lastName: 'BlackBird',
                dateOfBirth: '1990-01-01'
        )
    }
    response {
        status 201
        body(
                id: 3,
        )
        headers {
            contentType(applicationJson())
        }
    }
}


