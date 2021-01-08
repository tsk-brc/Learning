require './app/mission_d_149.rb'

describe '文字除去チェック' do
  describe '出力結果のテスト' do
    let(:missionD149) { MissionD149.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "pizza\n", "2\n"
      expect($stdout).to receive(:puts).with('pzza')
      missionD149.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "water\n", "5\n"
      expect($stdout).to receive(:puts).with('wate')
      missionD149.run
    end
  end
end
