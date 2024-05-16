### 👨‍💻 Hi there 👋

[![Github Badge](https://img.shields.io/badge/-Github-red?style=flat-square&logo=Github&logoColor=white&link=https://github.com/leonardorifeli)](https://github.com/leonardorifeli)
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-red?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardorifeli/)](https://www.linkedin.com/in/leonardorifeli/)
[![Twitter Badge](https://img.shields.io/badge/-Twitter-red?style=flat-square&labelColor=red&logo=twitter&logoColor=white&link=https://twitter.com/leonardorifeli)](https://twitter.com/leonardorifeli)
[![Kaggle Badge](https://img.shields.io/badge/-Kaggle-red?style=flat-square&logo=Kaggle&logoColor=white&link=https://www.kaggle.com/leonardorifeli)](https://www.kaggle.com/leonardorifeli)
[![Github Badge](https://komarev.com/ghpvc/?username=leonardorifeli&label=Profile%20views&color=red&style=flat)](https://github.com/leonardorifeli)

I'm [Leonardo](https://rifeli.dev). I'm a Brazilian Mathematician and Data Scientist.

- :office_worker: Co-founder & CTO at **@HarmoDeveloper**
- 📚 Mathematician and Data Scientist
- 💙 Main tech stacks: Golang and Python
- :octocat: Writer at [rifeli.dev](https://rifeli.dev)
- 🇧🇷 Antônio Carlos - SC

#### 👨‍💻 Repositories I created recently

{{- range recentRepos 5 }}
- **[{{ .Name }}]({{ .URL }})**{{ with .Description }} - {{ . }}{{ end }}
{{- end }}

#### 🔨 My recent Pull Requests

{{range recentPullRequests 5}}
- [{{.Title}}]({{.URL}}) on [{{.Repo.Name}}]({{.Repo.URL}}) ({{humanize .CreatedAt}})
{{- end}}

#### ⭐ Recent Stars

{{range recentStars 5}}
- [{{.Repo.Name}}]({{.Repo.URL}}) - {{.Repo.Description}} ({{humanize .StarredAt}})
{{- end}}

#### ❤️ Recent Followers

{{range followers 5}}
- [{{.Login}}](https://github.com/{{.Login}}) - {{.Name}}
{{end}}

#### ❤️ Recent Sponsors

{{range sponsors 5 }}
- [{{ or .User.Name .User.Login }}]({{ .User.URL }})
{{- end }}

Many thanks everyone! 🙏

#### ⛏️ What I've been working on
{{ range recentContributions 10 }}
- [{{.Repo.Name}}]({{.Repo.URL}})
{{- end }}

#### 📄 Latest blog posts

{{- range rss "https://rifeli.dev/blog/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }}) ({{ humanize .PublishedAt }})
{{- end }}

Created based on [Becker's](https://github.com/caarlos0) readme.