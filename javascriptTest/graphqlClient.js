const fetch = require('node-fetch');

async function request (url, linkName, cookie) {
    return await fetch(url, {
        method: 'POST',
        headers: {
            "Content-Type": "application/json",
            "authorization": cookie
        },
        body: JSON.stringify({
            query: `mutation createSnsLink {
                createSnsLink(linkName: "GITHUB1", link: "www.insta.com")
            }`
        })
    })
    .then((response)=> {console.log(response)})
    .catch((error)=>{
        console.log(error)
        return {resultCode: 500}
    })
}

request("http://localhost:4000/graphql", "youtube101","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTksIm5hbWUiOiLshJzsubgiLCJuaWNrTmFtZSI6InNlb2thbiIsInByb3ZpZGVyIjoiSyIsImVtYWlsIjoia2QwNDE5OUBuYXRlLmNvbSIsImRlc2MiOiLrp4jtg4Dtg4Ag7ISc7Lm47J6F64uI64ukIiwicHJvZmlsZUltZyI6Imh0dHBzOi8vZDJlZ3lweGk2bXBnOTMuY2xvdWRmcm9udC5uZXQvcHJvZmlsZUltZy8xOS0xNjM3NTkyMDU3OTkwLUlNR18yMDIxMTAyM18yMjQwMDZfNTMzLnBuZyIsImxvZ2luVHlwZSI6IktBS0FPIiwiaWF0IjoxNjQ1NzgwNTk4fQ.XlFYFDz59tqLlKVgSBuzOz0La0x_qDPVmaN1lT6nNts");
request("https://api-dev.celebstock.kr/graphql", "youtube101","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTksIm5hbWUiOiLshJzsubgiLCJuaWNrTmFtZSI6InNlb2thbiIsInByb3ZpZGVyIjoiSyIsImVtYWlsIjoia2QwNDE5OUBuYXRlLmNvbSIsImRlc2MiOiLrp4jtg4Dtg4Ag7ISc7Lm47J6F64uI64ukIiwicHJvZmlsZUltZyI6Imh0dHBzOi8vZDJlZ3lweGk2bXBnOTMuY2xvdWRmcm9udC5uZXQvcHJvZmlsZUltZy8xOS0xNjM3NTkyMDU3OTkwLUlNR18yMDIxMTAyM18yMjQwMDZfNTMzLnBuZyIsImxvZ2luVHlwZSI6IktBS0FPIiwiaWF0IjoxNjQ1NzgwNTk4fQ.XlFYFDz59tqLlKVgSBuzOz0La0x_qDPVmaN1lT6nNts")
request("http://localhost:4000/graphql", "youtube101","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTksIm5hbWUiOiLshJzsubgiLCJuaWNrTmFtZSI6InNlb2thbiIsInByb3ZpZGVyIjoiSyIsImVtYWlsIjoia2QwNDE5OUBuYXRlLmNvbSIsImRlc2MiOiLrp4jtg4Dtg4Ag7ISc7Lm47J6F64uI64ukIiwicHJvZmlsZUltZyI6Imh0dHBzOi8vZDJlZ3lweGk2bXBnOTMuY2xvdWRmcm9udC5uZXQvcHJvZmlsZUltZy8xOS0xNjM3NTkyMDU3OTkwLUlNR18yMDIxMTAyM18yMjQwMDZfNTMzLnBuZyIsImxvZ2luVHlwZSI6IktBS0FPIiwiaWF0IjoxNjQ1NzgwNTk4fQ.XlFYFDz59tqLlKVgSBuzOz0La0x_qDPVmaN1lT6nNts");
request("https://api-dev.celebstock.kr/graphql", "youtube101","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTksIm5hbWUiOiLshJzsubgiLCJuaWNrTmFtZSI6InNlb2thbiIsInByb3ZpZGVyIjoiSyIsImVtYWlsIjoia2QwNDE5OUBuYXRlLmNvbSIsImRlc2MiOiLrp4jtg4Dtg4Ag7ISc7Lm47J6F64uI64ukIiwicHJvZmlsZUltZyI6Imh0dHBzOi8vZDJlZ3lweGk2bXBnOTMuY2xvdWRmcm9udC5uZXQvcHJvZmlsZUltZy8xOS0xNjM3NTkyMDU3OTkwLUlNR18yMDIxMTAyM18yMjQwMDZfNTMzLnBuZyIsImxvZ2luVHlwZSI6IktBS0FPIiwiaWF0IjoxNjQ1NzgwNTk4fQ.XlFYFDz59tqLlKVgSBuzOz0La0x_qDPVmaN1lT6nNts")
request("http://localhost:4000/graphql", "youtube101","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTksIm5hbWUiOiLshJzsubgiLCJuaWNrTmFtZSI6InNlb2thbiIsInByb3ZpZGVyIjoiSyIsImVtYWlsIjoia2QwNDE5OUBuYXRlLmNvbSIsImRlc2MiOiLrp4jtg4Dtg4Ag7ISc7Lm47J6F64uI64ukIiwicHJvZmlsZUltZyI6Imh0dHBzOi8vZDJlZ3lweGk2bXBnOTMuY2xvdWRmcm9udC5uZXQvcHJvZmlsZUltZy8xOS0xNjM3NTkyMDU3OTkwLUlNR18yMDIxMTAyM18yMjQwMDZfNTMzLnBuZyIsImxvZ2luVHlwZSI6IktBS0FPIiwiaWF0IjoxNjQ1NzgwNTk4fQ.XlFYFDz59tqLlKVgSBuzOz0La0x_qDPVmaN1lT6nNts");
request("https://api-dev.celebstock.kr/graphql", "youtube101","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTksIm5hbWUiOiLshJzsubgiLCJuaWNrTmFtZSI6InNlb2thbiIsInByb3ZpZGVyIjoiSyIsImVtYWlsIjoia2QwNDE5OUBuYXRlLmNvbSIsImRlc2MiOiLrp4jtg4Dtg4Ag7ISc7Lm47J6F64uI64ukIiwicHJvZmlsZUltZyI6Imh0dHBzOi8vZDJlZ3lweGk2bXBnOTMuY2xvdWRmcm9udC5uZXQvcHJvZmlsZUltZy8xOS0xNjM3NTkyMDU3OTkwLUlNR18yMDIxMTAyM18yMjQwMDZfNTMzLnBuZyIsImxvZ2luVHlwZSI6IktBS0FPIiwiaWF0IjoxNjQ1NzgwNTk4fQ.XlFYFDz59tqLlKVgSBuzOz0La0x_qDPVmaN1lT6nNts")



