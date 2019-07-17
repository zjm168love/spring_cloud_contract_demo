import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name('customers')
    description('通过API导入物流信息')
    request {
        method GET()
        url('/api/customers')

    }


    response {
        status 200
        headers {
            contentType(applicationJson())
        }
        body("data": [
                [
                        "id"  : 1,
                        "name": "Chelsey"
                ],
                [
                        "id"  : 2,
                        "name": "Eleanora"
                ],
                [
                        "id"  : 4,
                        "name": "Farlie"
                ]
        ])

    }
}

