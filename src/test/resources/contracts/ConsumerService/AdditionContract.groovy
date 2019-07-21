import org.springframework.cloud.contract.spec.Contract

Contract.make {
	request{
		method 'POST'
		url '/add'
		body("""
		{
			"first":3,
			"second": 4 
		}
		"""
		)
		headers {
			contentType applicationJson()
	}
	}
	response {
		status 200
		body "7"
		headers {
			contentType textPlain()
		}
	}
}