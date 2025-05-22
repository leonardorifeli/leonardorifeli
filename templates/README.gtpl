### 👨‍💻 Hi there 👋

[![Github Badge](https://img.shields.io/badge/-Github-red?style=flat-square&logo=Github&logoColor=white&link=https://github.com/leonardorifeli)](https://github.com/leonardorifeli)
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-red?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardorifeli/)](https://www.linkedin.com/in/leonardorifeli/)
[![Github Badge](https://komarev.com/ghpvc/?username=leonardorifeli&label=Profile%20views&color=red&style=flat)](https://github.com/leonardorifeli)

[![Leonardo Rifeli profile views](https://u8views.com/api/v1/github/profiles/6767689/views/day-week-month-total-count.svg)](https://u8views.com/github/leonardorifeli)

I'm [Leonardo](https://rifeli.dev). I'm a Brazilian Data Scientist.

- :office_worker: Co-founder & CTO at **@HarmoDeveloper**
- 📚 Mathematician and Data Scientist
- 💙 Main tech stacks: Golang, Python and Javascript
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
- [{{ or .User.Name .User.Login }}]({{ .User.URL }}) - {{.User.Name}}
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

I created this readme based on [Becker's](https://github.com/caarlos0) readme.
