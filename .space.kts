job("Run npm test and publish") {
    container("node:alpine") {
        env["REGISTRY"] = "https://packages.jetbrains.team/npm/p/sasmp/npm/"
        shellScript {
            interpreter = "/bin/sh"
            content = """
                echo Install npm dependencies...
                npm ci
                echo Run build if it exists in package.json...
                npm run build --if-present
                echo Run tests...
                npm run test
                echo Run publishing...
                chmod +x ./publish.sh
                ./publish.sh
            """.trimIndent()
        }
    }
}