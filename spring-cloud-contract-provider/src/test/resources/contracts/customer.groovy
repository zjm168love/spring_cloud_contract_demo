import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name('customer')
    description('通过API导入物流信息')
    request {
        method GET()
        url('/api/one')
    }


    response {
        status 200
        headers {
            contentType(applicationJson())
        }
        body(
                "id": 1,
                "name": "Chelsey"

        )
        /*testMatchers {
            jsonPath('$.id', byRegex(number()))
            jsonPath('$.username', byRegex(onlyAlphaUnicode()))
        }*/
    }
}

