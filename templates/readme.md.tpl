### 👨‍💻 Hi there 👋

[![Github Badge](https://img.shields.io/badge/-Github-red?style=flat-square&logo=Github&logoColor=white&link=https://github.com/leonardorifeli)](https://github.com/leonardorifeli)
[![Linkedin Badge](https://img.shields.io/badge/-LinkedIn-red?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardorifeli/)](https://www.linkedin.com/in/leonardorifeli/)
[![Twitter Badge](https://img.shields.io/badge/-Twitter-red?style=flat-square&labelColor=red&logo=twitter&logoColor=white&link=https://twitter.com/leonardorifeli)](https://twitter.com/leonardorifeli)
[![Kaggle Badge](https://img.shields.io/badge/-Kaggle-red?style=flat-square&logo=Kaggle&logoColor=white&link=https://www.kaggle.com/leonardorifeli)](https://www.kaggle.com/leonardorifeli)
[![Github Badge](https://komarev.com/ghpvc/?username=leonardorifeli&label=Profile%20views&color=red&style=flat)](https://github.com/leonardorifeli)

I'm [Leonardo](https://rifeli.dev), I'm a Brazilian Mathematician and Data Scientist.

- :office_worker: Co-founder & CTO at **@HarmoDeveloper**
- 📚 Mathematician and Data Scientist
- 💙 Main tech stacks: Golang and Python
- :octocat: Writer at [rifeli.dev](https://rifeli.dev)
- 🇧🇷 Antônio Carlos - SC 🇧🇷

#### 👨‍💻 Repositories I created recently

{{- range recentRepos 5 }}
- **[{{ .Name }}]({{ .URL }})**{{ with .Description }} - {{ . }}{{ end }}
{{- end }}

#### ❤️ Recent Sponsors

{{- range sponsors 10 }}
- [{{ or .User.Name .User.Login }}]({{ .User.URL }})
{{- end }}

Many thanks everyone! 🙏

#### ⛏️ What I've been working on
{{ range recentContributions 10 }}
- [{{.Repo.Name}}]({{.Repo.URL}})
{{- end }}

#### 📚 Books I'm reading

{{- range literalClubCurrentlyReading 5 }}
- **[{{ .Title }}{{ with .Subtitle }} - {{ . }}{{ end }}](https://literal.club/leonardorifeli/book/{{.Slug}})** by _{{ range $i, $a := .Authors }}{{ if gt $i 0 }}, {{ end }}{{ $a.Name }}{{ end }}_
{{- end }}

#### 📄 Latest blog posts

{{- range rss "https://rifeli.dev/posts/index.xml" 5 }}
- [{{ .Title }}]({{ .URL }}) ({{ humanize .PublishedAt }})
{{- end }}

Created based on [Becker's](https://github.com/caarlos0) readme.