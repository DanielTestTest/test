# Title

Test gitbhub secrets

![figura](https://img.shields.io/github/license/Flexiana/notion-to-md)

![figura2](https://user-images.githubusercontent.com/23617959/148621218-41d0e309-18b6-4c8e-bc32-c3fada1f8788.png)


# notion-to-md Readme

> notion-to-md is a tool to import Notion pages to a Markdown format. It creates the Readme files that can be committed to you preferred git repository.

![icon and owther](https://img.shields.io/github/license/Flexiana/notion-to-md)

## Cncepts

![dinooooos](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f326275f-b07f-41cd-a145-a36d708cd591/Clipart_Dinossauro_II-Nilmara_Quintela_Paper_Designer-1-.jpeg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220113%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220113T125340Z&X-Amz-Expires=3600&X-Amz-Signature=a5a01e3e5523c0224932bc3a93ff04f0d5e660ed9cbc863a5046aec903cb6142&X-Amz-SignedHeaders=host&x-id=GetObject)
The Notion API requires a page-id and a notion-secret to provide the page’s content: [Notion - The all-in-one workspace for your notes, tasks, wikis, and databases.](https://www.notion.so/)

Examples:

- If the url is [https://www.notion.so/Testnet-8ddeb7e276c34685b460c5380f592f9d](https://www.notion.so/8ddeb7e276c34685b460c5380f592f9d) for instance, the page-id is [8ddeb7e276c34685b460c5380f592f9d](https://www.notion.so/8ddeb7e276c34685b460c5380f592f9d)

- The notion-secret is obtained by the Notion’s workspace configuration. The secret its something like: secret_j2oz4j12ddjoalmdp91phesdahjlcsdwq0u11ay3Df8

	[Notion - The all-in-one workspace for your notes, tasks, wikis, and databases.](https://www.notion.so/my-integrations)



## **Usage**

There are some ways you can use this tool.

- Using it via clojars is the preferred way. Add the below to your project.clj file and then invoke it with `lein notion-to-md`

	```clojure
    :profiles {:local
                 {:dependencies
                  [[clj-http "3.12.3"]
                   [org.clojars.danielhvs/notion-to-md "0.1.1"]]}}
    :aliases {"notion-to-md"     
                ["with-profile" 
                 "local" 
                 "run" 
                 "-m" 
                 "notion-to-md.core"]}

	```


- Using environment variables: NOTION_PAGE_ID and NOTION_API_SECRET and then invoking it directly

	```bash
    export NOTION_PAGE_ID="<page-id>"
    export NOTION_API_SECRET="<notion-secret>"
    lein run

	```


- Passing as the id and secret as parameters:

	```bash
    lein run <notion-secret> <page-id>

	```






