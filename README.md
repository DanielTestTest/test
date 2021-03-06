![embedded image external](https://img.shields.io/clojars/v/com.flexiana/notion-to-md)
![internal picture.png](docs/readme/internal%20picture.png)


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




