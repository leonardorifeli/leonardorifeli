### 👨‍💻 Hi there 👋

[![Github Badge](https://img.shields.io/badge/-Github-red?style=flat-square&logo=Github&logoColor=white&link=https://github.com/leonardorifeli)](https://github.com/leonardorifeli)
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-red?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardorifeli/)](https://www.linkedin.com/in/leonardorifeli/)
[![Github Badge](https://komarev.com/ghpvc/?username=leonardorifeli&label=Profile%20views&color=red&style=flat)](https://github.com/leonardorifeli)

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

{{- range rss "https://rifeli.dev/blog/index.xml" 10 }}
- [{{ .Title }}]({{ .URL }}) ({{ humanize .PublishedAt }})
{{- end }}

<h2 align="left">🎮 My Contributions</h2>
<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/leonardorifeli/leonardorifeli/refs/heads/master/dist/pacman-contribution-graph-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/leonardorifeli/leonardorifeli/refs/heads/master/dist/pacman-contribution-graph.svg">
  <img alt="pacman contribution graph" src="https://raw.githubusercontent.com/leonardorifeli/leonardorifeli/refs/heads/master/dist/pacman-contribution-graph.svg">
</picture>

I created this readme based on [Becker's](https://github.com/caarlos0) readme.
