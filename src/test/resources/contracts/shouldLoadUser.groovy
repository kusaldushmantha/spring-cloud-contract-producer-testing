package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("When a GET request with a UserID is made, the User is returned")
    request {
        method 'GET'
        url '/users/2'
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body(
                id: 2,
                firstName: 'John',
                lastName: 'Doe',
                dateOfBirth: '1990-01-01'
        )
        headers {
            contentType(applicationJson())
        }
    }
}


